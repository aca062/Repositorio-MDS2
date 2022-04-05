import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-listas_de_reproduccion_en_las_que_aparece')
export class VistaListas_de_reproduccion_en_las_que_aparece extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
